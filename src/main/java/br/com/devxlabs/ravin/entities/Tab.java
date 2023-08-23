package br.com.devxlabs.ravin.entities;

import java.util.List;

import br.com.devxlabs.ravin.enums.TabStatus;
import jakarta.persistence.*;

@Entity
public class Tab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "table_id")
	private Table table;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_Id")// rafencia campo da classe/tabela Customer
	private Customer customer;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OrderDetail> orderDetails;
	@Column(unique = true, nullable = false)
	private String code;
	private String comments;
	@Enumerated(value = EnumType.STRING)
	private TabStatus tabStatus;

	public Tab() {
		// TODO Auto-generated constructor stub
	}

	public Tab(int id, Table table, Customer customer, List<OrderDetail> orderDetails, String code,
			   String comments, TabStatus commandaStatus) {
		super();
		this.id = id;
		this.table = table;
		this.customer = customer;
		this.orderDetails = orderDetails;
		this.code = code;
		this.comments = comments;
		this.tabStatus = commandaStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getOrders() {
		return orderDetails;
	}

	public void setOrders(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public TabStatus getTabStatus() {
		return tabStatus;
	}

	public void setTabStatus(TabStatus tabStatus) {
		this.tabStatus = tabStatus;
	}

	@Override
	public String toString() {
		return "Commanda [id=" + id + ", table=" + table + ", customer=" + customer + ", orders=" + orderDetails + ", code="
				+ code + ", comments=" + comments + ", commandaStatus=" + tabStatus + "]";
	}	
}
