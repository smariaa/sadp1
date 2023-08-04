interface INotification {
    void notifying();
}

class Notification {
    private INotification notification;

    public Notification(INotification notification) {
        this.notification = notification;
    }

    public void notifying() {
        notification.notify();
    }
}

class MsgNotification implements INotification {
    @Override
    public void notifying() {
        System.out.println("New message");
    }
}

class CallNotification implements INotification {
    @Override
    public void notifying() {
        System.out.println("Call incoming");
    }

    public static void main(String[] args) {
        MsgNotification a = new MsgNotification();
        a.notifying();
        System.out.println("1");

        CallNotification b = new CallNotification();
        b.notifying();
        System.out.println("Unknown");
    }

}