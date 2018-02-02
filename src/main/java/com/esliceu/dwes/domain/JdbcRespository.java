package com.esliceu.dwes.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by xavi on 31/01/18.
 */

@Repository
public class JdbcRespository {


    @Autowired
    private JdbcTemplate template;

    @Autowired
    private RowMapper<Vers> versRowMapper;

    public List<Vers> findAllVersos() {
        String sql = "select * from vers";

        return template.query(sql, versRowMapper);
    }

    public List<Vers> findVersosLike(String like) {
        String sql = "select * from vers where vers.vers like ? ";

        return template.query(sql, new Object[]{"%" + like + "%"}, versRowMapper);
    }

    public List<Glosa> findGlosa() {

        String sql = "select * from glosa g " +
                "inner join vers v " +
                "on g.idglosa = v.glosa_idglosa ";
        //"where g.idglosa = ?";

        // new Object[]{id},

        return template.query(sql, rs -> {

            List<Glosa> gloses = new ArrayList<>();

            boolean next = rs.next();
            if (!next) return gloses;

            Glosa glosa = new Glosa();
            while (next) {


                if (glosa.getId() == null || rs.getInt("idglosa") != glosa.getId()) {
                    glosa = new Glosa();
                    gloses.add(glosa);
                    glosa.setVersos(new HashSet<>());
                    glosa.setId(rs.getInt("idglosa"));
                    glosa.setTitol(rs.getString("titol"));

                }

                glosa.getVersos().add(versRowMapper.mapRow(rs, rs.getRow()));
                next = rs.next();
            }
            return gloses;
        });

    }

    public List<Categoria> findAllCategories() {
        String sql = "select * from categoria";
        return template.query(sql, new BeanPropertyRowMapper<>(Categoria.class));
    }


}
