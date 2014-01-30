
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.*;

public class Player {
// verables
// beta tester peter
// artist austin, peter

    private Image img;
    int x, y, dx, dy, backgroundX, L_and_R_Counter, RedPlatform1X, RedPlatform2X, PlayerX, U_and_D_Counter, AmaterasuDragonCounter, rockX, ChidoriCounter, ResenganCounter,RunningCounter_R, nRock1HitCounter;
    long time;
    private final int SPEED = 6, GRAV = 1;
    boolean left, right, isJumping, isCrouching, release_R, release_L, isAttacking_AmaterasuDragon_R, isAttacking_Chidori_R, isFalling, isAttacking_arnResengan_R, isRunning, isRock1destroyed;
    private int Xmin, Xmax, Ymin, Ymax;
    private Board b;
    // images for the right running action
    ImageIcon i1 = new ImageIcon("walking_R_f1.png ");
    ImageIcon i2 = new ImageIcon("walking_R_f2.png");
    ImageIcon i3 = new ImageIcon("walking_R_f3.png");
    ImageIcon i4 = new ImageIcon("walking_R_f4.png");
    ImageIcon i5 = new ImageIcon("walking_R_f5.png");
    ImageIcon i6 = new ImageIcon("walking_R_f6.png");
    // images for the left running action
    ImageIcon i7 = new ImageIcon("walking_L_f1.png");
    ImageIcon i8 = new ImageIcon("walking_L_f2.png");
    ImageIcon i9 = new ImageIcon("walking_L_f3.png");
    ImageIcon i10 = new ImageIcon("walking_L_f4.png");
    ImageIcon i11 = new ImageIcon("walking_L_f5.png");
    ImageIcon i12 = new ImageIcon("walking_L_f6.png");
    // images for the standing left and right actions  
    ImageIcon i13 = new ImageIcon("Standing_R.png");
    ImageIcon i14 = new ImageIcon("Standing_L.png");
    // images for the jumping right action right
    ImageIcon i15 = new ImageIcon("Jumping_R_f1.png");
    ImageIcon i16 = new ImageIcon("Jumping_R_f2.png");
    ImageIcon i17 = new ImageIcon("Jumping_R_f3.png");
    ImageIcon i18 = new ImageIcon("Jumping_R_f4.png");
    ImageIcon i19 = new ImageIcon("Jumping_R_f5.png");
    ImageIcon i63 = new ImageIcon("Jumping_R_f6.png");
    //images for a Amaterasu Dragon attack right
    ImageIcon i20 = new ImageIcon("Amaterasu Dragon_R_f1.png");
    ImageIcon i21 = new ImageIcon("Amaterasu Dragon_R_f2.png");
    ImageIcon i22 = new ImageIcon("Amaterasu Dragon_R_f3.png");
    ImageIcon i23 = new ImageIcon("Amaterasu Dragon_R_f4.png");
    ImageIcon i24 = new ImageIcon("Amaterasu Dragon_R_f5.png");
    ImageIcon i25 = new ImageIcon("Amaterasu Dragon_R_f6.png");
    ImageIcon i26 = new ImageIcon("Amaterasu Dragon_R_f7.png");
    ImageIcon i27 = new ImageIcon("Amaterasu Dragon_R_f8.png");
    ImageIcon i28 = new ImageIcon("Amaterasu Dragon_R_f9.png");
    ImageIcon i29 = new ImageIcon("Amaterasu Dragon_R_f10.png");
    ImageIcon i30 = new ImageIcon("Amaterasu Dragon_R_f11.png");
    ImageIcon i31 = new ImageIcon("Amaterasu Dragon_R_f12.png");
    ImageIcon i32 = new ImageIcon("Amaterasu Dragon_R_f13.png");
    ImageIcon i33 = new ImageIcon("Amaterasu Dragon_R_f14.png");
    ImageIcon i34 = new ImageIcon("Amaterasu Dragon_R_f15.png");
    ImageIcon i35 = new ImageIcon("Amaterasu Dragon_R_f16.png");
    ImageIcon i36 = new ImageIcon("Amaterasu Dragon_R_f17.png");
    // Chidori attack right
    ImageIcon i37 = new ImageIcon("Chidori_R_f1.png");
    ImageIcon i38 = new ImageIcon("Chidori_R_f2.png");
    ImageIcon i39 = new ImageIcon("Chidori_R_f3.png");
    ImageIcon i40 = new ImageIcon("Chidori_R_f4.png");
    ImageIcon i41 = new ImageIcon("Chidori_R_f5.png");
    ImageIcon i42 = new ImageIcon("Chidori_R_f6.png");
    ImageIcon i43 = new ImageIcon("Chidori_R_f7.png");
    ImageIcon i44 = new ImageIcon("Chidori_R_f8.png");
    ImageIcon i45 = new ImageIcon("Chidori_R_f9.png");
    ImageIcon i46 = new ImageIcon("Chidori_R_f10.png");
    ImageIcon i47 = new ImageIcon("Chidori_R_f11.png");
    ImageIcon i48 = new ImageIcon("Chidori_R_f12.png");
    ImageIcon i49 = new ImageIcon("Chidori_R_f12.png");
    ImageIcon i50 = new ImageIcon("Chidori_R_f14.png");
    ImageIcon i51 = new ImageIcon("Chidori_R_f15.png");
    ImageIcon i52 = new ImageIcon("Chidori_R_f16.png");
    ImageIcon i53 = new ImageIcon("Chidori_R_f17.png");
    ImageIcon i54 = new ImageIcon("Chidori_R_f18.png");
    ImageIcon i55 = new ImageIcon("Chidori_R_f19.png");
    ImageIcon i56 = new ImageIcon("Chidori_R_f20.png");
    ImageIcon i57 = new ImageIcon("Chidori_R_f21.png");
    ImageIcon i58 = new ImageIcon("Chidori_R_f22.png");
    ImageIcon i59 = new ImageIcon("Chidori_R_f23.png");
    ImageIcon i60 = new ImageIcon("Chidori_R_f24.png");
    ImageIcon i61 = new ImageIcon("Chidori_R_f25.png");
    ImageIcon i62 = new ImageIcon("Chidori_R_f26.png");
    // Resengan attack right
    ImageIcon i64 = new ImageIcon("Rasengan_R_f1.png");
    ImageIcon i65 = new ImageIcon("Rasengan_R_f2.png");
    ImageIcon i66 = new ImageIcon("Rasengan_R_f3.png");
    ImageIcon i67 = new ImageIcon("Rasengan_R_f4.png");
    ImageIcon i68 = new ImageIcon("Rasengan_R_f5.png");
    ImageIcon i69 = new ImageIcon("Rasengan_R_f6.png");
    ImageIcon i70 = new ImageIcon("Rasengan_R_f7.png");
    ImageIcon i71 = new ImageIcon("Rasengan_R_f8.png");
    ImageIcon i72 = new ImageIcon("Rasengan_R_f9.png");
    ImageIcon i73 = new ImageIcon("Rasengan_R_f10.png");
    ImageIcon i74 = new ImageIcon("Rasengan_R_f11.png");
    ImageIcon i75 = new ImageIcon("Rasengan_R_f12.png");
    ImageIcon i76 = new ImageIcon("Rasengan_R_f13.png");
    ImageIcon i77 = new ImageIcon("Rasengan_R_f14.png");
    ImageIcon i78 = new ImageIcon("Rasengan_R_f15.png");
    ImageIcon i79 = new ImageIcon("Rasengan_R_f16.png");
    ImageIcon i80 = new ImageIcon("Rasengan_R_f17.png");
    ImageIcon i81 = new ImageIcon("Rasengan_R_f18.png");
    ImageIcon i82 = new ImageIcon("Rasengan_R_f19.png");
    ImageIcon i83 = new ImageIcon("Rasengan_R_f20.png");
    ImageIcon i84 = new ImageIcon("Rasengan_R_f21.png");
    ImageIcon i85 = new ImageIcon("Rasengan_R_f22.png");
    ImageIcon i86 = new ImageIcon("Rasengan_R_f23.png");
    ImageIcon i87 = new ImageIcon("Rasengan_R_f24.png");
    ImageIcon i88 = new ImageIcon("Rasengan_R_f24.png");
    ImageIcon i89 = new ImageIcon("Rasengan_R_f25.png");
    ImageIcon i90 = new ImageIcon("Rasengan_R_f26.png");
    ImageIcon i91 = new ImageIcon("Rasengan_R_f27.png");
    // running right images
    ImageIcon i92 = new ImageIcon("Running_R_f1.png");
    ImageIcon i93 = new ImageIcon("Running_R_f2.png");
    ImageIcon i94 = new ImageIcon("Running_R_f3.png");
    ImageIcon i95 = new ImageIcon("Running_R_f4.png");
    ImageIcon i96 = new ImageIcon("Running_R_f5.png");
    ImageIcon i97 = new ImageIcon("Running_R_f6.png");
    // running left images
    ImageIcon i98 = new ImageIcon("Running_L_f1.png");
    ImageIcon i99 = new ImageIcon("Running_L_f2.png");
    ImageIcon i100 = new ImageIcon("Running_L_f3.png");
    ImageIcon i101 = new ImageIcon("Running_L_f4.png");
    ImageIcon i102 = new ImageIcon("Running_L_f5.png");
    ImageIcon i103 = new ImageIcon("Running_L_f6.png");
    // array's holding the sets of images
    Image arnWalking_R[] = new Image[6];
    Image arnWalking_L[] = new Image[6];
    Image arnjumping_R[] = new Image[5];
    Image arnAmaterasuDragon_R[] = new Image[17];
    Image arnChidori_R[] = new Image[26];
    Image arnResengan_R[] = new Image[29];
    Image arnRunning_R[] = new Image[6];

// player image and place on the stage and other verable definations 
    public Player() {
        x = 350;
        y = 238;
        dx = 0;
        dy = 0;
        backgroundX = 0;
        RedPlatform1X = 400;
        RedPlatform2X = 600;
        rockX = 800;
        Xmin = 350;
        Xmax = 450;
        L_and_R_Counter = 0;
        PlayerX = 350;
        U_and_D_Counter = 0;
        AmaterasuDragonCounter = 0;
        ChidoriCounter = 0;
        ResenganCounter = 0;
        RunningCounter_R = 0;
        nRock1HitCounter = 0;
        left = false;
        right = false;
        isJumping = false;
        isCrouching = false;
        isFalling = false;
        release_R = false;
        release_L = false;
        isAttacking_AmaterasuDragon_R = false;
        isAttacking_Chidori_R = false;
        isAttacking_arnResengan_R = false;
        isRunning = false;
        isRock1destroyed = false;

        // images set to running right array
        arnWalking_R[0] = i1.getImage();
        arnWalking_R[1] = i2.getImage();
        arnWalking_R[2] = i3.getImage();
        arnWalking_R[3] = i4.getImage();
        arnWalking_R[4] = i5.getImage();
        arnWalking_R[5] = i6.getImage();
        //images set to running left array
        arnWalking_L[0] = i7.getImage();
        arnWalking_L[1] = i8.getImage();
        arnWalking_L[2] = i9.getImage();
        arnWalking_L[3] = i10.getImage();
        arnWalking_L[4] = i11.getImage();
        arnWalking_L[5] = i12.getImage();
        // images set to jumping right array
        arnjumping_R[0] = i15.getImage();
        arnjumping_R[1] = i16.getImage();
        arnjumping_R[2] = i17.getImage();
        arnjumping_R[3] = i18.getImage();
        arnjumping_R[4] = i19.getImage();
        //images set to sword attack array
        arnAmaterasuDragon_R[0] = i20.getImage();
        arnAmaterasuDragon_R[1] = i21.getImage();
        arnAmaterasuDragon_R[2] = i22.getImage();
        arnAmaterasuDragon_R[3] = i23.getImage();
        arnAmaterasuDragon_R[4] = i24.getImage();
        arnAmaterasuDragon_R[5] = i25.getImage();
        arnAmaterasuDragon_R[6] = i26.getImage();
        arnAmaterasuDragon_R[7] = i27.getImage();
        arnAmaterasuDragon_R[8] = i28.getImage();
        arnAmaterasuDragon_R[9] = i29.getImage();
        arnAmaterasuDragon_R[10] = i30.getImage();
        arnAmaterasuDragon_R[11] = i31.getImage();
        arnAmaterasuDragon_R[12] = i32.getImage();
        arnAmaterasuDragon_R[13] = i33.getImage();
        arnAmaterasuDragon_R[14] = i34.getImage();
        arnAmaterasuDragon_R[15] = i35.getImage();
        arnAmaterasuDragon_R[16] = i36.getImage();
        //
        arnChidori_R[0] = i37.getImage();
        arnChidori_R[1] = i38.getImage();
        arnChidori_R[2] = i39.getImage();
        arnChidori_R[3] = i40.getImage();
        arnChidori_R[4] = i41.getImage();
        arnChidori_R[5] = i42.getImage();
        arnChidori_R[6] = i43.getImage();
        arnChidori_R[7] = i44.getImage();
        arnChidori_R[8] = i45.getImage();
        arnChidori_R[9] = i46.getImage();
        arnChidori_R[10] = i47.getImage();
        arnChidori_R[11] = i48.getImage();
        arnChidori_R[12] = i49.getImage();
        arnChidori_R[13] = i50.getImage();
        arnChidori_R[14] = i51.getImage();
        arnChidori_R[15] = i52.getImage();
        arnChidori_R[16] = i53.getImage();
        arnChidori_R[17] = i54.getImage();
        arnChidori_R[18] = i55.getImage();
        arnChidori_R[19] = i56.getImage();
        arnChidori_R[20] = i57.getImage();
        arnChidori_R[21] = i58.getImage();
        arnChidori_R[22] = i59.getImage();
        arnChidori_R[23] = i60.getImage();
        arnChidori_R[24] = i61.getImage();
        arnChidori_R[25] = i62.getImage();
        //
        arnResengan_R[0] = i64.getImage();
        arnResengan_R[1] = i65.getImage();
        arnResengan_R[2] = i66.getImage();
        arnResengan_R[3] = i67.getImage();
        arnResengan_R[4] = i68.getImage();
        arnResengan_R[5] = i69.getImage();
        arnResengan_R[6] = i70.getImage();
        arnResengan_R[7] = i71.getImage();
        arnResengan_R[8] = i72.getImage();
        arnResengan_R[9] = i73.getImage();
        arnResengan_R[10] = i74.getImage();
        arnResengan_R[11] = i75.getImage();
        arnResengan_R[12] = i76.getImage();
        arnResengan_R[13] = i77.getImage();
        arnResengan_R[14] = i78.getImage();
        arnResengan_R[15] = i79.getImage();
        arnResengan_R[16] = i80.getImage();
        arnResengan_R[17] = i81.getImage();
        arnResengan_R[18] = i82.getImage();
        arnResengan_R[19] = i83.getImage();
        arnResengan_R[20] = i84.getImage();
        arnResengan_R[21] = i85.getImage();
        arnResengan_R[22] = i86.getImage();
        arnResengan_R[23] = i87.getImage();
        arnResengan_R[24] = i88.getImage();
        arnResengan_R[25] = i89.getImage();
        arnResengan_R[26] = i90.getImage();
        arnResengan_R[27] = i91.getImage();


    }

    // how to move the stage to make it look like the player is moving
    public void move() {
        x += dx;
        backgroundX = (backgroundX - dx);
        RedPlatform1X = (RedPlatform1X - dx);
        RedPlatform2X = (RedPlatform2X - dx);
        rockX = (rockX - dx);
        // makes the jumping motion incremental into 4 movements
        if (isJumping) {
            y = 238 - (int) (90 * (((float) U_and_D_Counter) / 4));
        }
        // if the player walks off the platform they will fall to the ground
        if (!isJumping && !isOnPlatform()) {
            y = 238;
            isFalling = true;
            isJumping = false;
        }

    }
    // check the current state of the X cordinate of the focoused stage

    public int getX() {
        return x;
    }
    // check the Current state of the Y cordinate of the focoused stage 

    public int getY() {
        return y;
    }
    // image stuff

    public Image getImage() {

        img = i13.getImage();

        if (right == true) {
            release_L = false;
            release_R = false;
            img = arnWalking_R[L_and_R_Counter];
            L_and_R_Counter++;
            if (L_and_R_Counter == 6) {
                L_and_R_Counter = 0;
            }
        }
        if (left == true) {
            release_R = false;
            release_L = false;
            img = arnWalking_L[L_and_R_Counter];
            L_and_R_Counter++;
            if (L_and_R_Counter == 6) {
                L_and_R_Counter = 0;
            }

        }
        if (release_L == true) {
            img = i14.getImage();
        }
        if (isJumping == true) {
            img = arnjumping_R[U_and_D_Counter];
            U_and_D_Counter++;
            if (U_and_D_Counter == 5) {
                U_and_D_Counter = 4;
            }
        }
        if (isAttacking_AmaterasuDragon_R == true) {
            img = arnAmaterasuDragon_R[AmaterasuDragonCounter];
            AmaterasuDragonCounter++;
            if (AmaterasuDragonCounter == 17) {
                AmaterasuDragonCounter = 16;
            }
        }
        if (isAttacking_Chidori_R == true) {
            img = arnChidori_R[ChidoriCounter];
            ChidoriCounter++;
            if (ChidoriCounter > 12 && ChidoriCounter < 17) {
                dx = 16;
            }
            if (ChidoriCounter == 26) {
                ChidoriCounter = 25;
            }
            if (ChidoriCounter > 16) {
                dx = 0;
            }
        }
        if (isCrouching == true) {
            img = i63.getImage();
        }
        if (isAttacking_arnResengan_R == true) {
            img = arnResengan_R[ResenganCounter];
            ResenganCounter++;
            if (ResenganCounter == 28) {
                ResenganCounter = 27;
            }
            if (ResenganCounter > 11 && ResenganCounter < 17) {
                dx = 16;
            }
            if (ResenganCounter > 16) {
                dx = 0;
            }
            if(isRunning == true && right == true){
                img = arnRunning_R[RunningCounter_R];
                RunningCounter_R++;
                if(RunningCounter_R == 6){
                    RunningCounter_R = 0;
                }
            }
        }

        return img;
    }
    // check what key is pressed

    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        //if the lest key is pressed the player will move to the left
        if (code == KeyEvent.VK_A) {
            left = true;
            right = false;
            dx = -SPEED;
            //if the right key is pressed the player will move to the right
        } else if (code == KeyEvent.VK_D) {
            right = true;
            left = false;
            dx = SPEED;

        } // if the up key is pressed the player move up
        else if (code == KeyEvent.VK_W) {
            isJumping = true;
        } else if (code == KeyEvent.VK_S) {
            isCrouching = true;
        } else if (code == KeyEvent.VK_J) {
            isAttacking_AmaterasuDragon_R = true;
        } else if (code == KeyEvent.VK_K) {
            isAttacking_Chidori_R = true;
            if(isAttackHittingRock() == true && ChidoriCounter == 18){
                nRock1HitCounter++;
            }
        } else if (code == KeyEvent.VK_DOWN) {
            isCrouching = true;
        } else if (code == KeyEvent.VK_L) {
            isAttacking_arnResengan_R = true;
             if(isAttackHittingRock() == true && ResenganCounter == 24){
                nRock1HitCounter++;
            }
        }
        else if (code == KeyEvent.VK_CONTROL){
            isRunning = true;
        }
        if(nRock1HitCounter == 4){
            isRock1destroyed = true;
        }
    }
    // check what key is released

    public void keyReleased(KeyEvent e) {
        int code = e.getKeyCode();
        // code to make character (Stage) to the left
        if (!isOnPlatform()) {
            U_and_D_Counter = 0;
        }
        L_and_R_Counter = 0;
        if (code == KeyEvent.VK_A) {
            left = false;
            release_L = true;
            if (right) {
                dx = SPEED;
            } else {
                dx = 0;
            }
            // code to make character (Stage) to the right
        } else if (code == KeyEvent.VK_D) {
            right = false;
            release_R = true;
            if (left) {
                dx = -SPEED;
            } else {
                dx = 0;
            }
        } else if (code == KeyEvent.VK_W) {
            isJumping = false;
        } else if (code == KeyEvent.VK_J) {
            isAttacking_AmaterasuDragon_R = false;
            AmaterasuDragonCounter = 0;
        } else if (code == KeyEvent.VK_K) {
            isAttacking_Chidori_R = false;
            ChidoriCounter = 0;            
        } else if (code == KeyEvent.VK_S) {
            isCrouching = false;
        } else if (code == KeyEvent.VK_L) {
            isAttacking_arnResengan_R = false;
            ResenganCounter = 0;
        }
        if(code == KeyEvent.VK_CONTROL){
            isRunning = false;
        }

    }

    public boolean isOnPlatform() {
        if (PlayerX > (RedPlatform1X - 28) && PlayerX < (RedPlatform1X + 50)) {
            return true;
        } else if (PlayerX > (RedPlatform2X - 28) && PlayerX < (RedPlatform2X + 50)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isAtRock() {
        if (PlayerX > (rockX - 70) && PlayerX < (rockX + 42)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isAttackHittingRock(){
        int nFrontOfAttack;
        if(isAttacking_Chidori_R == true){
            nFrontOfAttack = PlayerX + 20;
            if(nFrontOfAttack > (rockX - 70) && nFrontOfAttack < (rockX + 42)){
                return true;
            }
        }
         if(isAttacking_arnResengan_R == true){
            nFrontOfAttack = PlayerX + 30;
            if(nFrontOfAttack > (rockX - 70) && nFrontOfAttack < (rockX + 42)){
                return true;
            }
        }
        return false;
    }
}
