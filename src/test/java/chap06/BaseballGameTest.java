package chap06;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

/** BeforeAll AfterAll은 static에 사용되기 때문에, 클래스 변수에 대한 접근이 있다면 마찬가지로 그 놈도 static..
 *
 */
@DisplayName("야구 게임에 대한 테스트 메서드")
public class BaseballGameTest {
    public static BaseballGame game;

    @BeforeAll
    static void givenGame() {
        game = new BaseballGame("456");
    }

    @DisplayName("456을 세팅하고 256에 대한 strike와 ball을 검증하는 테스트 메서드")
    @Test
    void exactMatch(){
        // 실행
        Score score = game.guess("256");
        assertEquals(2, score.strikes);
        assertEquals(1, score.balls);
    }
}
