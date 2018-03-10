package 设计模式.装饰者模式.测试二;

public class CodingTask implements Runnable {

  private final int employeeId;

  public CodingTask(int employeeId) {
    this.employeeId = employeeId;
  }

  @Override
  public void run() {
    System.out.println("Employee " + employeeId
        + " started writing code.");

    try {
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }

    System.out.println("Employee " + employeeId
        + " finished writing code.");
  }
}
