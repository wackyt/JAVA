import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Scoreboard extends JFrame
{
    private int mAcMilan = 0;
    private int mRealMadrid = 0;
    private Font mFont = new Font("Times new roman", Font.BOLD, 20);
    private JButton mAcMilanButton = new JButton("AC Milan");
    private JButton mRealMadridButton = new JButton("Real Madrid");

    private JLabel mResult = new JLabel("Result " + mAcMilan + "X" + mRealMadrid);
    private JLabel mLast = new JLabel("Last Scorer: N/A");
    private JLabel mWin = new JLabel("Winner: DRAW");

    public Scoreboard()
    {
        super("Milan VS Madrid");
        setLayout(null);
        mAcMilanButton.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    mAcMilan++;
                    mResult.setText("Result " + mAcMilan + "X" + mRealMadrid);
                    mLast.setText("Last Scorer: AC Milan");

                    if (mAcMilan > mRealMadrid)
                    {
                        mWin.setText("Winner: AC Milan");
                    }
                    else
                    if(mAcMilan < mRealMadrid)
                    {
                        mWin.setText("Winner: Real Madrid");
                    }
                    else
                    {
                        mWin.setText("Winner: DRAW");
                    }
                }
            }
        );

        mRealMadridButton.addActionListener
        (
            new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    mRealMadrid++;
                    mResult.setText("Result " + mAcMilan + "X" + mRealMadrid);
                    mLast.setText("Last Scorer: Real Madrid");
                    if (mAcMilan > mRealMadrid)
                    {
                        mWin.setText("Winner: AC Milan");
                    }
                    else
                    if (mAcMilan < mRealMadrid)
                    {
                        mWin.setText("Winner: Real Madrid");
                    }
                    else
                    {
                        mWin.setText("Winner: DRAW");
                    }
                }
            }
        );
        mLast.setLocation(150,10);
        mLast.setSize(200, 50);
        mResult.setLocation(150,50);
        mResult.setSize(200,50);
        mAcMilanButton.setLocation(50,100);
        mAcMilanButton.setSize(100,50);
        mRealMadridButton.setLocation(250,100);
        mRealMadridButton.setSize(150,50);
        mWin.setLocation(150,170);
        mWin.setSize(200,50);
        add(mLast);
        add(mResult);
        add(mAcMilanButton);
        add(mRealMadridButton);
        add(mWin);
        setSize(450, 270);
    }
}
