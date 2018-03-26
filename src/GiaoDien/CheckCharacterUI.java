/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaoDien;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author NguyenNam
 */
public class CheckCharacterUI extends PlainDocument{ //Kiểm tra kí tự, chỉ số và chữ
    @Override
    public void insertString(int off, String str, AttributeSet a) throws BadLocationException{
        if (str==null) return;
        char[] s=str.toCharArray();
        StringBuffer strbuff=new StringBuffer();
        for (int i=0;i<s.length;i++)
            if (Character.isDigit(s[i])||Character.isLetter(s[i])) strbuff.append(s[i]);
        super.insertString(off,new String(strbuff),a);
    }
}
