package br.com.devxlabs.ravin.controllers.interfaces;

import br.com.devxlabs.ravin.entities.Tab;
import br.com.devxlabs.ravin.entities.OrderDetail;
import br.com.devxlabs.ravin.enums.TabStatus;

public interface CommandaControllerInterface extends ControllerInterface<Tab> {
	
	public void addOrder(OrderDetail order) throws Exception;
	public void removeOrder(OrderDetail pedido) throws Exception;
	public void closeCommanda() throws Exception;
	public void listCommandasByStatus(TabStatus status);
	public double calculateTotalCommandaValue();

}
