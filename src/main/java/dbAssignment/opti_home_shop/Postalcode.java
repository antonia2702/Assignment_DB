package dbAssignment.opti_home_shop;

import com.sun.istack.NotNull;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.List;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name="postalcode")
public class Postalcode
{
	@Id
	@Column (name = "PC_Id")
	@NotNull
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
	@NotNull
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
	@NotNull
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
	@NotNull
	@CreationTimestamp
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
	@NotNull
	@UpdateTimestamp
	private java.sql.Timestamp PC_UpdateDate;
	public java.sql.Timestamp getPC_UpdateDate()
	{
		return this.PC_UpdateDate;
	}
	public void setPC_UpdateDate(java.sql.Timestamp value)
	{
		this.PC_UpdateDate = value;
	}

	@OneToMany(mappedBy = "PC", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Billingadress> billingadresses;
	public List<Billingadress> getBillingadresses() {
		return billingadresses;
	}
	public void setBillingadresses(List<Billingadress> billingadresses) {
		this.billingadresses = billingadresses;
	}

	@OneToMany(mappedBy = "PC", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Deliveryadress> deliveryadresses;
	public List<Deliveryadress> getDeliveryadresses() {
		return deliveryadresses;
	}
	public void setDeliveryadresses(List<Deliveryadress> deliveryadresses) {
		this.deliveryadresses = deliveryadresses;
	}
	
	@OneToMany(mappedBy = "PC", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Supplier> suppliers;
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	public Postalcode(int PC_Id_, String PC_Place_,String PC_State_)
	{
		this.PC_Id = PC_Id_;
		this.PC_Place = PC_Place_;
		this.PC_State = PC_State_;
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
