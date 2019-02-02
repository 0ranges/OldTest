package DPshiyan.DP3;

/**
 * Created by user on 2018/1/4.
 */
public class Q01 {
    public static void main(String[] args) {
        OneKeyBackupFacade oneKeyBackupFacade = new OneKeyBackupFacade();
        oneKeyBackupFacade.oneKeyBackup();
    }
}
class ContactManager{
    public void Backup(){
        System.out.println("通讯录备份完成！");
    }
}
class MessageManager{
    public void Backup(){
        System.out.println("短信备份完成！");
    }
}
class MusicManager{
    public void Backup(){
        System.out.println("音乐备份完成！");
    }
}
class PictureManager{
    public void Backup(){
        System.out.println("图片备份完成！");
    }
}
class OneKeyBackupFacade{
    private ContactManager contactManager = new ContactManager();
    private MessageManager messageManager = new MessageManager();
    private PictureManager pictureManager = new PictureManager();
    private MusicManager musicManager = new MusicManager();
    public void oneKeyBackup(){
        contactManager.Backup();
        messageManager.Backup();
        pictureManager.Backup();
        musicManager.Backup();
        System.out.println("通讯录、短信、音乐、图片均已完成备份。");
    }
}
