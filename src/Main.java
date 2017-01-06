import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        int number,age,salary;
        System.out.println("[메뉴]\n");
        System.out.println("\t1. 사원 추가");
        System.out.println("\t2. 사원 삭제");
        System.out.println("\t3. 전체사원 출력");
        System.out.println("\t4. 끝내기\n");
        System.out.print("번호 입력 : ");
        n=s.nextInt();

        if(n==1)
        {
            System.out.print("사원 번호 : ");
            number=s.nextInt();
            System.out.print("사원 나이 : ");
            age=s.nextInt();
            System.out.print("사원 봉급 : ");
            salary=s.nextInt();
            addEmployee(new Employee(number,age,salary));
        }
        else if(n==2)
        {
            System.out.print("삭제할 사원 번호 : ");
            number=s.nextInt();
            if(deleteEmployee(number))
            {
                System.out.println("삭제 성공\n");
            }
            else
            {
                System.out.println("해당 번호의 사원이 없습니다.\n");
            }
        }
        else if(n==3)
        {
            printAllEmployee();
        }
        else if(n==4)
        {
            return;
        }

    }

    public static void addEmployee(Employee employee)
    {
        
    }

    public static boolean deleteEmployee(int number)
    {

    }

    public static void printAllEmployee()
    {

    }
}
