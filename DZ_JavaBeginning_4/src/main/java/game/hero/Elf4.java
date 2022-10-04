package game.hero;

public class Elf4 {
    private int id;
    private String nickname;

    public Elf4() {}

    public Elf4(int id)
    {
        this.id = id;
    }

    public Elf4(String nickname)
    {
        this.nickname = nickname;
    }

    public Elf4(int id, String nickname)
    {
        this.id = id;
        this.nickname = nickname;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public int getId()
    {
        return id;
    }

    public String getNickname()
    {
        return nickname;
    }
}
