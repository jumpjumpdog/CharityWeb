package com.tongji.charityweb.repository.user;

import com.tongji.charityweb.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by LSL on 2017/11/21
 *
 * JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.
 *
 * Their main functions are:
 * CrudRepository mainly provides CRUD functions.
 * PagingAndSortingRepository provide methods to do pagination and sorting records.
 * JpaRepository provides some JPA related method such as flushing the persistence context and delete record in a batch.
 * Because of the inheritance mentioned above,  JpaRepository will have all the functions of CrudRepository and PagingAndSortingRepository.
 * So if you don't need the repository to have the functions provided by JpaRepository and PagingAndSortingRepository , use CrudRepository.
 *
 */

@Transactional
@Repository
public interface UserRepository extends JpaRepository<User,String>
{
	public User findByEmail(String email);

	public User findByUsernameAndPassword(String username,String password);

	public User findByUsername(String username);

	public void deleteByUsername(String username);

}
