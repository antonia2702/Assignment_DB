package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="role")
public class Role
{
	@Id
	@Column (name = "R_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int R_Id;
	public int getR_Id()
	{
		return this.R_Id;
	}
	public void setR_Id(int value)
	{
		this.R_Id = value;
	}

	@Column
	@NotNull
	private String R_Group;
	public String getR_Group()
	{
		return this.R_Group;
	}
	public void setR_Group(String value)
	{
		this.R_Group = value;
	}

	@Column
	@NotNull
	@CreationTimestamp
	private java.sql.Timestamp R_CreateDate;
	public java.sql.Timestamp getR_CreateDate()
	{
		return this.R_CreateDate;
	}
	public void setR_CreateDate(java.sql.Timestamp value)
	{
		this.R_CreateDate = value;
	}

	@Column
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp R_UpdateDate;
	public java.sql.Timestamp getR_UpdateDate()
	{
		return this.R_UpdateDate;
	}
	public void setR_UpdateDate(java.sql.Timestamp value)
	{
		this.R_UpdateDate = value;
	}
	
	@OneToMany(mappedBy = "R")
	private List<Customeraccount> customeraccounts;
	public List<Customeraccount> getCustomeraccounts() {
		return customeraccounts;
	}
	public void setCustomeraccounts(List<Customeraccount> customeraccounts) {
		this.customeraccounts = customeraccounts;
	}

	public Role(String R_Group_)
	{
		this.R_Group = R_Group_;
	}
	
	public Role() {}
	
	@Override 
	public String toString() {
		return R_Group;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Role role = (Role) o;
        return Objects.equals( R_Id, role.R_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (R_Id, R_Group, R_CreateDate, R_UpdateDate);
    }
}
