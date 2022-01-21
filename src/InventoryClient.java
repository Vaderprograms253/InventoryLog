public class InventoryClient {
    public static void main(String[] args) {
        InventoryLog inventory = new InventoryLog();
        System.out.println("Size expected: 0, Size:" + inventory.size());
        System.out.println("Empty List? \nExpected: True," + inventory.isEmpty());
        System.out.println("Adding letters to list");
        inventory.add('a');
        inventory.add('b');
        inventory.add('s');
        inventory.add('s');
        inventory.add('s');
        inventory.add('s');
        inventory.add('x');
        inventory.add('s');
        inventory.set('x', 8);
        System.out.println(inventory);
        System.out.println(inventory.get('s'));

      //  System.out.println(inventory.toString());
      //  System.out.println(inventory.isEmpty());
    }
}
