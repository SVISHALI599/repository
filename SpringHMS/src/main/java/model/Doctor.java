package model;

public class Doctor extends User{
	@Override
	public String toString() {
		return "Doctor [pk_doctor_id=" + pk_doctor_id + ", fk_user_id=" + fk_user_id + " , doctor_experience=" + doctor_experience + ",doctor_specialization=" + doctor_specialization + "]";
	}
	public int getpk_doctor_id() {
		return pk_doctor_id;
	}

	public void setpk_doctor_id(int pk_doctor_id) {
		this.pk_doctor_id = pk_doctor_id;
	}
	public int getfk_user_id() {
		return fk_user_id;
	}

	public void setfk_user_id(int fk_user_id) {
		this.fk_user_id = fk_user_id;
	}
	
	public String getdoctor_specialization() {
		return doctor_specialization;
	}

	public void setdoctor_specialization(String doctor_specialization) {
		this.doctor_specialization = doctor_specialization;
	}
	public int getdoctor_experience() {
		return doctor_experience;
	}

	public void setdoctor_experience(int doctor_experience) {
		this.doctor_experience = doctor_experience;
	}

	public int pk_doctor_id;
	public int fk_user_id;
	public String doctor_specialization;
	public int doctor_experience;

}
