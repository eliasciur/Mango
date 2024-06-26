public class Source {
  private String file;
  private int line;
  private int column;

  Source(String file, int line, int column) {
    this.file = file;
    this.line = line;
    this.column = column;
  }

  @Override
  public String toString() {
    return String.format("at %s:%d:%d", file, line, column);
  }
}