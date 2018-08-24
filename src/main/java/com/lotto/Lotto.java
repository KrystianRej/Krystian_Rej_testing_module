package com.lotto;


import java.util.*;

public class Lotto {
    public Set<Integer> getUserList()
    {
        Set<Integer> userList = new HashSet<Integer>();
        Scanner scanner = new Scanner(System.in);
        int userNumber = 0;
        while(userList.size() < 6)
        {
            userNumber = scanner.nextInt();

            if(userNumber > 0 && userNumber < 50)
            {
                userList.add(userNumber);
            }
            System.out.println("Wprowadzono liczb: " + userList.size());

        }
        return userList;
    }
    public Set<Integer> getComputerList()
    {
        Set<Integer> computerList = new HashSet<Integer>();
        Random generator = new Random();
        while(computerList.size() < 6)
        {
            computerList.add(generator.nextInt(49)+1);
        }
        return computerList;
    }
    public int hitByUser(Set<Integer> userList, Set<Integer> computerList)
    {
        int counter = 0;
        for(Integer temporary: userList)
        {
            if(computerList.contains(temporary))
            {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int counter = lotto.hitByUser(lotto.getUserList(),lotto.getComputerList());
        System.out.println("Zostalo trafionych: " + counter + " liczb");
    }
}
