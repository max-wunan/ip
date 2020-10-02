# Duke Project User Guide

This is a project template for a greenfield Java project. It's named after the Java mascot _Duke_. Given below are instructions on how to use it.

## Setting Up in Intellij

Prerequisites: JDK 11, update Intellij to the most recent version.

1. Open Intellij (if you are not in the welcome screen, click `File` > `Close Project` to close the existing project dialog first)
1. Set up the correct JDK version, as follows:
   1. Click `Configure` > `Structure for New Projects` and then `Project Settings` > `Project` > `Project SDK`
   1. If JDK 11 is listed in the drop down, select it. If it is not, click `New...` and select the directory where you installed JDK 11
   1. Click `OK`
1. Import the project into Intellij as follows:
   1. Click `Open or Import`.
   1. Select the project directory, and click `OK`
   1. If there are any further prompts, accept the defaults.
1. After the importing is complete, locate the `src/main/java/Duke.java` file, right-click it, and choose `Run Duke.main()`. If the setup is correct, you should see something like the below:
   ```
   Hello from
    ____        _        
   |  _ \ _   _| | _____ 
   | | | | | | | |/ / _ \
   | |_| | |_| |   <  __/
   |____/ \__,_|_|\_\___|
   ```

## Using Duke Project

1. To display all the tasks and relevant information
    1. Launch the app and type in 'list', all necessary information will be printed as below:
    ```
    list
    -----------------------
    Here are the tasks in your list:
    1.[T][✘] task A
    2.[D][✘] Task B (by: deadline)
    ...
    
    -----------------------
    ```
    1. If it is your first time using Duke Project, there will be no data stored, so when you type in 'list', it will look as follows:
    ```
    list
    -----------------------
    Here are the tasks in your list:
        
    -----------------------
    ```
1. To add tasks (and date/time if needed)
    1. If you want to add a 'Todo' task, which is the kind of task without date/time, all you need to do is to key in 'Todo description', as description is to be replaced by the content of this 'Todo' task, which is, what exactly you are going to do. It will look as follows:
    ```
    todo borrow book
    -----------------------
    Got it. I've added this task: 
    [T][✘]borrow book
    Now you have 1 tasks in the list.
            
    -----------------------
    ```
   1. If you want to add a 'Deadline' task, which the type of task must be completed before a certain time/day, you will need to key in both description and deadline date in the format 'Deadline description /by date'. It will look as follows:
    ```
    deadline CS2113 assignment /by Friday
    -----------------------
    Got it. I've added this task: 
    [D][✘]CS2113 assignment (by: Friday)
    Now you have 2 tasks in the list.
        
    -----------------------
    ```
    1. If you want to add an 'Event' task, which represents an event happening in the future, you will need to key in both description and event time as well in the format 'event team meeting /at Monday'. It will look as follows:
    ```
    event team meeting /at Monday
    -----------------------
    Got it. I've added this task: 
    [E][✘]team meeting (at: Monday)
    Now you have 3 tasks in the list.
        
    -----------------------
    ```
1. To delete/edit/search for tasks
    1. If you want to delete a task, you will need to know its index in the list printed through list. Suppose now the list contains the following tasks:
    ```
    list
    -----------------------
    Here are the tasks in your list:
    1.[T][✘]borrow book
    
    2.[D][✘]CS2113 assignment (by: Friday)
    
    3.[E][✘]team meeting (at: Monday)
        
    -----------------------
    ```
    For example, you want to delete the assignment as Friday has already passed, all you need to do is to key in 'delete taskIndex', and in this case 'taskIndex' = 2. It will be as follows:
    ```
    delete 2
    -----------------------
    Noted. I've removed this task: 
    [D][✘]CS2113 assignment (by: Friday)
    Now you have 2 tasks in the list.
        
    -----------------------
    ```
    1. If you want to mark a task as done, you will also need to know the index if the task. Suppose the initial list is identical as above, if you want to mark borrow book as done, you need to key in 'done taskIndex', and in this case the 'taskIndex' = 1. It will look as follows:
    ``` 
    done 1
    -----------------------
    Nice! I've marked this task as done:
    
    [T][✓]borrow book
        
    -----------------------
    ```
    1. If you want to search for a task based on certain keywords, all you need to do is to key in 'find keyword', where keyword is to be replaced by the actual keyword. The app will display all tasks whose description contain the keyword you chose. Suppose the initial list is still the same as above, the result of searching will look as follows:
    ```
    find meeting
    -----------------------
    Here are the matching tasks in your list:
    1.[E][✘]team meeting (at: Monday)
        
    -----------------------
    ```
    If none of the tasks contain your keyword in the descripton, it will look as follows:
    ```
    find abcdefghijklmnopq
    -----------------------
    Here are the matching tasks in your list:
        
    -----------------------
    ```
   
   
