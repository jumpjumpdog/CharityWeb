package com.tongji.charityweb.repository.repository;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.tongji.charityweb.model.repository.Repository;
import com.tongji.charityweb.model.repository.RepositoryID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@org.springframework.stereotype.Repository
public interface RepRepository  extends JpaRepository<Repository,RepositoryID> {
    public Repository findByRepNameAndUserName(String repName, String userName);
}
