# Design a Pen

---	
&nbsp;
> _Questions_

* What is a pen and its expected behaviour? __[Fundamental Question]__
* Type of pen(ink/ball)? __[Design Question]__
* Pen should be able to write or not? __[Design Question]__
* Ink Color __[Implementation Question]__
* Size of pen __[Implementation Question]__

&nbsp;

---	
&nbsp;
> Requirments

1. Design a pen with write functionality.
2. Anything which have nib, body nd write with a ink[So digitial pen is out of question].
3. Different types of pen ex : Ball pen, Ink Pen. Writing behaviour is different for different type of pen.
4. Ball Pen has a refile, Ink pen is empty.
5. **Future scope** like sketchpen and marker.

&nbsp;
---	

&nbsp;

> UML Diagram

1. ER and Class Diagram draw together

* Pen [Entity]
    1. Ball Pen
        1. Refile
    2. Ink Pen
        1. Tube

_They will have a 'write' interface as in future chalk can also get added_

* Nib [Attribute as not complex]


* Body [Entity]
    * Material
    * Color


* Ink [Entity]
    1. Color

__Nib,Body,Ink are Entity but color of ink for example is a attribute as they are not that complex if they are very
complex like ink can have different property then they are entity by itself__