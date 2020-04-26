package com.eoi;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contacts = new ArrayList<Contacts>();
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contacts = new ArrayList<Contacts>();
    }

    public boolean addContacts(Contacts a)
    {
        if(findContacts(a)>=0)
        {
            System.out.println("the contact aleary exists!");
            return false;
        }
        else
        {
            contacts.add(a);
            return true;
        }

    }

    public boolean updateContact(Contacts oldC, Contacts newC)
    {
        if(findContacts(oldC)>=0)
        {
            if(findContacts(oldC.getName())>=0)
            {
                System.out.println("the given name exists");
                return false;
            }
            else
            {
                int position =  contacts.indexOf(oldC);
                contacts.set(position,newC);
                return  true;
            }


        }
        else
        {

            System.out.println("the contact doesn't exist");
            return false;
        }

    }

    public boolean removeContact(Contacts c)
    {
        if(findContacts(c)>=0)
        {
            contacts.remove(c);
            return true;
        }
        else
        {
            System.out.println("the contact doesn't exist");
            return false;
        }

    }



    public int findContacts(Contacts a)
    {
        if(contacts.indexOf(a)>=0)
        {
            System.out.println("the given contact is found");
            return contacts.indexOf(a);
        }
        else
        {
            return -1;
        }

    }

    public int findContacts(String name)
    {
        for(int i =0 ;i<contacts.size();i++)
        {
            if(contacts.get(i).getName().equals(name))
            {
                System.out.println("the given name is found");
                return i;
            }
        }

        return -1;
    }

    public void printContacts()
    {
        for(int i =0 ;i<contacts.size();i++)
        {
            System.out.println(contacts.get(i).getName()+" "+contacts.get(i).getNumber());
        }
    }



}
