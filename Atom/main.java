class main {
  public static void main(String[] args) {
    VipCustomer vipCustomer = new VipCustomer("Sally", "Mae", 10000.76);

    System.out.println("");
    System.out.println("firstName: " + vipCustomer.getfirstName());
    System.out.println("lastName: " + vipCustomer.getlastName());
    System.out.println("balance: " + vipCustomer.getbalance());
  }
}
