/*
 * MIT License
 *
 * Copyright (c) 2017 hellojavaer
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.hellojavaer.fatjar.examples.demo3;

import org.hellojavaer.fatjar.examples.demo2.EClass;
import org.hellojavaer.fatjar.core.boot.FatJarBoot;

import java.net.MalformedURLException;

/**
 *
 * @author <a href="mailto:hellojavaer@gmail.com">Kaiming Zou</a>,created on 12/03/2017.
 */
public class FClass {

    static {
        System.out.println(FClass.class.getSimpleName() + " is loaded by " + FClass.class.getClassLoader());
        FatJarBoot.run();
    }

    public void say(String msg) {
        EClass eClass = new EClass();
        eClass.say(msg);
    }

    public static void main(String[] args) throws MalformedURLException, ClassNotFoundException,
                                          IllegalAccessException, InstantiationException, NoSuchMethodException {

        FClass fClass = new FClass();
        fClass.say("hi!");
    }

}
