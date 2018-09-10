package com.lanmei.user.dao.mapper;

import com.lanmei.user.dao.model.OsUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OsUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_user
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_user
     *
     * @mbggenerated
     */
    int insert(OsUser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_user
     *
     * @mbggenerated
     */
    OsUser selectByPrimaryKey(Integer userId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_user
     *
     * @mbggenerated
     */
    List<OsUser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table os_user
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(OsUser record);

    /**
     *
     * @param userId
     * @return
     */
    OsUser selectById(Long  userId);
    /**
     *
     * @param phoneNum
     * @return
     */
    OsUser selectByPhoneNum(String phoneNum);



    int insertRegister(OsUser record);

    OsUser selectByTelNum(String phoneNum);

    OsUser selectByEmail(String email);

    OsUser selectByNickName(String nickName);

    OsUser selectByUser(@Param("nickName") String nickName,@Param("phoneNum") String phoneNum,@Param("email")String email);



    int updatePasswordByTelNum(@Param("phoneNum") String phoneNum,
                               @Param("loginPassword") String loginPassword,
                               @Param("salt") String salt );

    int updatePasswordByEmail(@Param("email")String email,
                              @Param("loginPassword") String loginPassword,
                              @Param("salt") String salt );

    int updatePasswordByNickName(@Param("nickName")String nickName,
                                 @Param("loginPassword") String loginPassword,
                                 @Param("salt") String salt );

}