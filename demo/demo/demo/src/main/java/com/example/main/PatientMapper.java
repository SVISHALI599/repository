package com.example.main;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface PatientMapper {
	@Select("SELECT user_name, user_age, user_gender, user_mobile_number, user_email_id, user_address_line1, user_address_line2, user_address_line3, patient_disease FROM t_user JOIN t_patient ON t_user.pk_user_id=t_patient.fk_user_id")
	List<Patient> getAllPatient();

	@Select("select * from  t_patient where pk_patient_id=#{pk_patient_id}")
	Patient getPatientById(int id);
	
	@Insert("INSERT INTO t_patient (pk_patient_id,fk_user_id,patient_disease) VALUES (#{pk_patient_id},#{fk_user_id},#{patient_disease})")
	Patient setPatient();
}