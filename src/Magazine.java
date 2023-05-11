import java.util.Stack;

public class Magazine {

    private int capacity;
    private int current;
    private Stack<Bullet> mag;

    public Magazine(int capacity) {
        mag = new Stack<Bullet>();
        this.capacity = capacity;
        this.current = 0;
    }

    public void loadBullet(Bullet bullet) {
        if (this.current < this.capacity) {
            mag.push(bullet);
            this.current++;
            System.out.println("Loaded " + bullet.getName() + ".");
        } else {
            System.out.println("Error! Magazine is full!");
        }
    }

    public void unloadBullet() {
        if (this.current > 0) {
            Bullet bullet = mag.pop();
            this.current--;
            System.out.println("Ejected " + bullet.getName() + ".");
        } else {
            System.out.println("Error! Magazine is empty!");
        }
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getCurrent() {
        return this.current;
    }

    private void setCurrent(int rounds) {
        this.current = rounds;
    }

    public String toString() {
        String str;
        str = "This magazine currently has " + getCurrent() + " out of " + getCapacity() + " rounds loaded.";
        if (this.current == 0) {
            return str;
        } else {
            str += " The top bullet is " + mag.peek().getName() + ".";
        }
        return str;
    }
}
