class VipCustomer {
  private String firstName, lastName;
  private Double balance;

  public VipCustomer() {
    this("John", "Doe", 0.00);
    System.out.println("No parameters given. Using defaults.");
  }

  public VipCustomer(String firstName, String lastName) {
    this(firstName, lastName, 0.00);
    System.out.println("Constructor with two parameters called.");
  }

  public VipCustomer(String firstName, String lastName, Double balance) {
    System.out.println("Constructor with 3 parameters called.");
    this.firstName = firstName;
    this.lastName = lastName;
    this.balance = balance;
  }

  public String getfirstName() {
    return firstName;
  }

  public String getlastName() {
    return lastName;
  }

  public Double getbalance() {
    return balance;
  }

}
