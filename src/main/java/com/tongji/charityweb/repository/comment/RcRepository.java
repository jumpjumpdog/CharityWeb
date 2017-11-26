package com.tongji.charityweb.repository.comment;

import com.tongji.charityweb.model.comment.RepositoryComment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LSL on 2017/11/24
 */
@Transactional
@Repository
public interface RcRepository extends JpaRepository<RepositoryComment,Long>
{
}
