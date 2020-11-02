package dbAssignment.opti_home_shop;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="postalcode")
public class Postalcode
{
	@Id
	@Column (name = "PC_Id")
	private int PC_Id;
	public int getPC_Id()
	{
		return this.PC_Id;
	}
	public void setPC_Id(int value)
	{
		this.PC_Id = value;
	}

	@Column
	private String PC_Place;
	public String getPC_Place()
	{
		return this.PC_Place;
	}
	public void setPC_Place(String value)
	{
		this.PC_Place = value;
	}

	@Column
	private String PC_State;
	public String getPC_State()
	{
		return this.PC_State;
	}
	public void setPC_State(String value)
	{
		this.PC_State = value;
	}

	@Column
	private java.sql.Timestamp PC_CreateDate;
	public java.sql.Timestamp getPC_CreateDate()
	{
		return this.PC_CreateDate;
	}
	public void setPC_CreateDate(java.sql.Timestamp value)
	{
		this.PC_CreateDate = value;
	}

	@Column
	private java.sql.Timestamp PC_UpdateDate;
	public java.sql.Timestamp getPC_UpdateDate()
	{
		return this.PC_UpdateDate;
	}
	public void setPC_UpdateDate(java.sql.Timestamp value)
	{
		this.PC_UpdateDate = value;
	}


	public Postalcode(int PC_Id_,String PC_Place_,String PC_State_,java.sql.Timestamp PC_CreateDate_,java.sql.Timestamp PC_UpdateDate_)
	{
		this.PC_Id = PC_Id_;
		this.PC_Place = PC_Place_;
		this.PC_State = PC_State_;
		this.PC_CreateDate = PC_CreateDate_;
		this.PC_UpdateDate = PC_UpdateDate_;
	}
	
	public Postalcode() {}
	
	@Override 
	public String toString() {
		return PC_Place+", "+PC_State;
	}
	@Override
    public boolean equals( Object o ) {
        if ( this == o ) {
            return true;
        }

        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }

        Postalcode postalcode = (Postalcode) o;
        return Objects.equals( PC_Id, postalcode.PC_Id );
    }


    @Override
    public int hashCode() {
        return Objects.hash (PC_Id, PC_Place, PC_State, PC_CreateDate);
    }
}
