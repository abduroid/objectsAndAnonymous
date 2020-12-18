public class Manager {

    public void experiment() {

        System.out.println();
        System.out.println("--------------");

        System.out.println("Managers hashCode: " + this.hashCode() + " this: " + this);
        System.out.println("---");

        AnotherUser anotherUser = new AnotherUser();

        System.out.println("Another user hashCode: " + anotherUser.hashCode());

        anotherUser.useListener(new FinishListener() {
            @Override
            public void onFinished() {

                System.out.println("this: " + this + " hashCode is: " + hashCode() + " Manager.this.hashCode: " + Manager.this.hashCode());
                //TODO super

            }
        });


        new FinishListener() {

            @Override
            public void onFinished() {
                System.out.println("Totally not saved anonymous object: "  + hashCode());
            }
        }.onFinished();
    }

}
