package interviewWork;
import java.util.*;
public class _牛客_餐馆
{
    public static class Customer implements Comparable<Customer>
    {
        int number; //顾客人数
        int budget; //顾客预算

        @Override
        public int compareTo(Customer o)
        {
            return o.budget - budget;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            int numTable = sc.nextInt(); //输入几张桌子
            int numCustomer = sc.nextInt(); //输入几组顾客

            //key: 桌子能容纳的人数 Value:多少张桌子
            TreeMap<Integer,Integer> tableCapacityMap = new TreeMap<>();

            for(int i = 0; i < numTable; i++)
            {
                int capacity = sc.nextInt();
                int count = tableCapacityMap.getOrDefault(capacity,0);
                tableCapacityMap.put(capacity,count + 1);
            }

            //每组顾客的人数和消费金额
            Customer[] customers = new Customer[numCustomer];

            for(int i = 0; i < numCustomer; i++)
            {
                customers[i] = new Customer();
                customers[i].number = sc.nextInt();
                customers[i].budget = sc.nextInt();
            }

            Arrays.parallelSort(customers);

            //开始贪心算法
            long profit = 0;

            for(int i = 0; i < numCustomer && !tableCapacityMap.isEmpty(); i++)
            {
                Customer customer = customers[i];

                Integer key = tableCapacityMap.ceilingKey(customer.number);
                if(key == null)
                {
                    //没找到合适的桌子
                    continue;
                }

                profit += customer.budget;

                int count = tableCapacityMap.get(key);
                if(count == 1)
                {
                    tableCapacityMap.remove(key);
                }
                else
                {
                    tableCapacityMap.put(key,count - 1);
                }
            }
            System.out.println(profit);
        }
    }
}
