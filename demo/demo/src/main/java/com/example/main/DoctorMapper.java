package com.example.main;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface DoctorMapper {
	@Select("SELECT user_name, user_age, user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, user_address_line3, doctor_specialization,doctor_experience FROM t_user JOIN t_doctor ON t_user.pk_user_id=t_doctor.fk_user_id")
	List<Doctor> getAllDoctor();

	@Select("select * from  t_doctor where pk_doctor_id=#{pk_doctor_id}")
	Doctor getDoctorById(int id);
	
	@Insert("INSERT INTO t_doctor(pk_doctor_id,fk_user_id,doctor_specialization,doctor_experience) VALUES (#{pk_patient_id},#{fk_user_id},#{doctor_specialization},#{doctor_experience})")
	Doctor setDoctor();
}