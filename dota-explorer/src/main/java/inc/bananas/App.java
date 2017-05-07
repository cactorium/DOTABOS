package inc.bananas;

/**
 * Hello world!
 *
 */
public class App {

  public interface Traversable {
    Traversable getChild(String name);
    String[] listChildren();
    Traversable getParent();
  }

  public class PathPart implements Traversable {
    Object obj;
    Traversable parent;

    public PathPart(Object o, Traversable t) {
      this.obj = o;
      this.parent = t;
    }

    public static PathPart fromObject(Object o, Traversable t) {
      return new PathPart(o, t);
    }

    Traversable getChild(String name) {
      return null;
    }

    String[] listChildren() {
      return null;
    }

    Traversable getParent() {
      return parent;
    }
  }

  public static void main(String[] args) {
  }
}
