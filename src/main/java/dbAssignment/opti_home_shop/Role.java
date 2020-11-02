package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role
{
	@Id
	@Column (name = "R_Id")
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
	private java.sql.Timestamp R_UpdateDate;
	public java.sql.Timestamp getR_UpdateDate()
	{
		return this.R_UpdateDate;
	}
	public void setR_UpdateDate(java.sql.Timestamp value)
	{
		this.R_UpdateDate = value;
	}


	public Role(int R_Id_,String R_Group_,java.sql.Timestamp R_CreateDate_,java.sql.Timestamp R_UpdateDate_)
	{
		this.R_Id = R_Id_;
		this.R_Group = R_Group_;
		this.R_CreateDate = R_CreateDate_;
		this.R_UpdateDate = R_UpdateDate_;
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
