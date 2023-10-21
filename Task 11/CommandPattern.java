import java.util.ArrayList;
import java.util.List;

class Chef {
    public void makeBurger() {
        System.out.println("Chef is making a burger.");
    }
    public void makePizza() {
        System.out.println("Chef is making a pizza.");
    }
}

interface Command {
    void execute();
}

class BurgerCommand implements Command {
    private Chef chef;
    public BurgerCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.makeBurger();
    }
}

class PizzaCommand implements Command {
    private Chef chef;
    public PizzaCommand(Chef chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        chef.makePizza();
    }
}

class Waiter {
    private List<Command> orders = new ArrayList<>();
    public void takeOrder(Command command) {
        orders.add(command);
    }

    public void submitOrders() {
        for (Command command : orders) {
            command.execute();
        }
        orders.clear();
    }
}

public class CommandPattern {
    public static void main(String[] args) {
        Chef chef = new Chef();

        Command burgerCommand = new BurgerCommand(chef);
        Command pizzaCommand = new PizzaCommand(chef);

        Waiter waiter = new Waiter();
        waiter.takeOrder(burgerCommand);
        waiter.takeOrder(pizzaCommand);
        waiter.submitOrders();
    }
}