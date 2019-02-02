package DPshiyan.DP3;

import java.util.ArrayList;

/**
 * Created by user on 2018/1/13.
 */
public class Q07 {
    private static ArrayList<MenuItem> menuItemList = new ArrayList();
    public static void addMenuItem(MenuItem menuItem){
        menuItemList.add(menuItem);
    }

    public static void main(String[] args) {
        AbstractCommand01 openCommand,createCommand,editCommand;
        openCommand = new OpenCommand();
        createCommand = new CreateCommand();
        editCommand = new EditCommand();
        MenuItem menuItem1,menuItem2,menuItem3;
        menuItem1 = new MenuItem();
        menuItem2 = new MenuItem();
        menuItem3 = new MenuItem();
        menuItem1.setCommand(openCommand);
        menuItem2.setCommand(createCommand);
        menuItem3.setCommand(editCommand);
        menuItemList.add(menuItem1);
        menuItemList.add(menuItem2);
        menuItemList.add(menuItem3);
        for (MenuItem menuItem : menuItemList) {
            menuItem.click();
        }
    }
}
abstract class AbstractCommand01{
    public abstract void execute();
}
class BoardScreen{
    public void open(){
        System.out.println("打开");
    }
    public void create(){
        System.out.println("新建");
    }
    public void edit(){
        System.out.println("编辑");
    }
}
class OpenCommand extends AbstractCommand01{
    BoardScreen boardScreen;
    public OpenCommand(){
        boardScreen = new BoardScreen();
    }
    public void execute(){
        boardScreen.open();
    }
}
class CreateCommand extends AbstractCommand01{
    BoardScreen boardScreen;
    public CreateCommand(){
        boardScreen = new BoardScreen();
    }
    public void execute(){
        boardScreen.create();
    }
}
class EditCommand extends AbstractCommand01{
    BoardScreen boardScreen;
    public EditCommand(){
        boardScreen = new BoardScreen();
    }
    public void execute(){
        boardScreen.edit();
    }
}
class MenuItem{
    private AbstractCommand01 command;
    public void click(){
        command.execute();
    }
    public void setCommand(AbstractCommand01 command){
        this.command = command;
    }
}