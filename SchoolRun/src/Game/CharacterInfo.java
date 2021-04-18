
package Game;

public class CharacterInfo {
public static String now = "¾Ö±â";
public static String runStr = "..//image//game_image//student_run.gif";
static String jumpStr = "..//image//game_image//student_jump.png";
static String doubleJumpStr = "..//image//game_image//student_doublejump.gif";
static String fallStr = "..//image//game_image//bongstudent_jump_1_fall.png";
static String hitStr = "..//image//game_image//student_fall.png";
static String slideStr = "..//image//game_image//student_slide.png";

public void setCharacter(String now, String run, String jump, String doubleJump, String fall, String slide) {
this.now = now;
this.runStr = run;
this.jumpStr = jump;
this.doubleJumpStr = doubleJump;
this.fallStr = fall;
this.hitStr = fall;
this.slideStr = slide;
}
}
