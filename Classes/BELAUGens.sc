/*
 * BELAUGens to access the analog and digital I/O
 *  created by nescivi, (c) 2016
 *  https://www.nescivi.eu
 */

/* input: id of analog pin to read; can be modulated at audiorate
 * output: value of analog analogPin
 */
AnalogInput : UGen {
    *ar { arg analogPin = 0, mul=1.0, add=0.0;
        ^this.multiNew('audio', analogPin ).madd(mul,add)
    }
}

/* input 1: id of analog pin to read; can be modulated at audiorate
 * input 2: value to write out
 * output: none
 */
AnalogOutput : UGen {
    *ar { arg analogPin = 0, output=0, mul=1.0, add=0.0;
        ^this.multiNew('audio', analogPin, output ).madd(mul,add)
    }
}

/* input: id of digital pin to read; cannot be modulated
 * output: value of digital pin
 */
DigitalInput : UGen {
    *ar { arg digitalPin = 0, mul=1.0, add=0.0;
        ^this.multiNew('audio', digitalPin ).madd(mul,add)
    }
}

/* input 1: id of digital pin to read; cannot be modulated
 * input 2: value to write out
 * output: none
 */
DigitalOutput : UGen {
    *ar { arg digitalPin = 0, output=0, mul=1.0, add=0.0;
        ^this.multiNew('audio', digitalPin, output ).madd(mul,add)
    }
}

/* input 1: id of digital pin to read; cannot be modulated
 * input 2: value to write out
 * input 3: pin mode ( < 0.5 = input, otherwise output)
 * output: value of digital pin (last read value)
 */
DigitalIO : UGen {
    *ar { arg digitalPin = 0, output=0, pinMode=0, mul=1.0, add=0.0;
        ^this.multiNew('audio', digitalPin, output, pinMode ).madd(mul,add)
    }
}
