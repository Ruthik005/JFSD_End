package Hibernate.Hibernate_demo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
//import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="DailyEmployee")
//@DiscriminatorValue(value="dailyempTable")

@AttributeOverrides(
		{
	@AttributeOverride(name="@id",column=@Column(name="de_id")),
	@AttributeOverride(name="@fn",column=@Column(name="de_fn")),
	@AttributeOverride(name="@ln",column=@Column(name="de_ln"))
}
)

public class DailyEmp extends Employee{

	public Double getDailywages() {
		return dailywages;
	}
	public void setDailywages(Double dailywages) {
		this.dailywages = dailywages;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}
	Double dailywages;
	@Column(name="experience")
	int exp;
}
