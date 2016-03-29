public class Pizza {
 
 Pizza_State cookedState;
 Pizza_State bakedState;
 Pizza_State deliveredState;
 Pizza_State UndeliverableState;
 
 private String name;
 
 //State initialization
 private Pizza_State state = cookedState;
 
 public Pizza() {
  cookedState = new CookedPizzaState(this);
  bakedState = new BakedPizzaState(this);
  deliveredState = new DeliveredPizzaState(this);
  UndeliverableState = new UndeliverableState(this);
  
 }
 
 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public Pizza_State getState() {
  return state;
 }

 public void setState(Pizza_State state) {
  this.state = state;
 }
 
 public void bake() throws Exception {
  this.state.bake();
 } 
 
 public void deliver() throws Exception {
  this.state.deliver();
 }

 public Pizza_State getCookedState() {
  return state;
 }

 public Pizza_State getBakedState() {
  return bakedState;
 }

 public Pizza_State getDeliveredState() {
  return deliveredState;
 }
 public Pizza_State getUnDeliveredState() {
	  return UndeliverableState;
	 }
}