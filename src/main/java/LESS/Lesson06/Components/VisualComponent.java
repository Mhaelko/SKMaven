package LESS.Lesson06.Components;

public interface VisualComponent {
    void draw();
    default void draw3D() {
        System.out.println("Visual3D");
    }
}
