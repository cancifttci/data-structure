package main;

import dataLayer.DataInitializer;
import product.*;
import structure.DynamicList;
import structure.Queue;
import structure.Stack;

public class Controller 
{	
	private Queue<Order> createWaitingLine()
	{
		DataInitializer dataInit = new DataInitializer();
		DynamicList<Order> orderList = dataInit.initializeData();
		Queue<Order> orderQueue = new Queue<>();
		for (int i = 0; i < orderList.getLength(); i++) 
		{
			orderQueue.enqueue(orderList.getEntry(i)); 
		}
		return orderQueue;
	}
	
	private DynamicList<Cargo> createCargo(Queue<Order> orders, Stack<Tuna> tuna, Stack<Corn> corn,
												Stack<Pudding> pudding, Stack<InstantNoodle> instantNoodle) 
	{
		DynamicList<Cargo> returnVal = new DynamicList<>();
		
		while (!orders.isEmpty()) {
			
			Order tempOrder = orders.dequeue();
			DynamicList<Product> tempProducts = new DynamicList<>();
			
			switch (tempOrder.getFoodCategory1()) {
			case "tuna":
				tempProducts.add(tuna.pop());
				break;
			case "corn":
				tempProducts.add(corn.pop());
				break;
			case "noodle":
				tempProducts.add(instantNoodle.pop());
				break;
			case "pudding":
				tempProducts.add(pudding.pop());
				break;
			default:
				break;
			}
			
			switch (tempOrder.getFoodCategory2()) {
			case "tuna":
				tempProducts.add(tuna.pop());
				break;
			case "corn":
				tempProducts.add(corn.pop());
				break;
			case "noodle":
				tempProducts.add(instantNoodle.pop());
				break;
			case "pudding":
				tempProducts.add(pudding.pop());
				break;
			default:
				break;
			}
			switch (tempOrder.getFoodCategory3()) {
			case "tuna":
				tempProducts.add(tuna.pop());
				break;
			case "corn":
				tempProducts.add(corn.pop());
				break;
			case "noodle":
				tempProducts.add(instantNoodle.pop());
				break;
			case "pudding":
				tempProducts.add(pudding.pop());
				break;
			default:
				break;
			}
			
			Cargo cargo = new Cargo(tempOrder.getOrderId(), tempOrder.getDate(), tempProducts);
			returnVal.add(cargo);
		}
		
		return returnVal;
	}
	
	private DynamicList<Cargo> sortCargoPackets(DynamicList<Cargo> cargoList) 
	{	
		DynamicList<Cargo> temp = new DynamicList<>();
		int length = cargoList.getLength();
		for (int i = 0; i < length; i++) 
		{	
			for (int j = 0; j < cargoList.getLength(); j++) 
			{	
				if (cargoList.getEntry(j).getCargoID() == i+1) 
				{
					temp.add(cargoList.remove(j));
				}
				
			}
			
		}	
		return temp;
	}
	
	public void startProcess() 
	{	
		GenerateProduct productGenerator = new GenerateProduct();
		Stack<Tuna> tunaStack = productGenerator.createTuna(30);
		Stack<Corn> cornStack = productGenerator.createCorn(30);
		Stack<Pudding> puddingStack = productGenerator.createPudding(30);
		Stack<InstantNoodle> instantNoodleStack = productGenerator.createInstantNoodle(30);
		System.out.println("\n------------------ INITIAL STACK -------------------\n");
		tunaStack.printAll();
		cornStack.printAll();
		puddingStack.printAll();
		instantNoodleStack.printAll();
		System.out.println("\n------------------ WAITING LINE OF ORDERS -------------------\n");
		Queue<Order> orderQueue = createWaitingLine();
		orderQueue.printAll();
		DynamicList<Cargo> cargoList= createCargo(orderQueue, tunaStack, cornStack, puddingStack, instantNoodleStack);
		DynamicList<Cargo> sortedCargoList = sortCargoPackets(cargoList);
		System.out.println("\n------------------ FINAL STATE OF STACK -------------------\n");
		tunaStack.printAll();
		cornStack.printAll();
		puddingStack.printAll();
		instantNoodleStack.printAll();
		System.out.println("\n------------------ CARGO PACKETS -------------------\n");
		sortedCargoList.printAll();
		System.out.println("\n------------------ EXPIRATION DATES OF PRODUCTS THAT INSIDE CARGO PACKET ID 25 -------------------\n");
		for (int i = 0; i < 3; i++) 
		{	
			String temProduct = sortedCargoList.getEntry(24).getProductList().getEntry(i).getExpirationDate();
			System.out.println(temProduct);
		}
		sortedCargoList.remove(19);
		System.out.println("\n------------------ CARGO LIST THAT AFTER REMOVING CARGO PACKET ID 20 -------------------\n");
		sortedCargoList.printAll();
		
	}
	
}
