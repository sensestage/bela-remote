#!/bin/sh
SCSOURCE=../supercollider/
THISDIR=$PWD

cp $SCSOURCE/SCClassLibrary/Common/Audio/bela/BELAUGens.sc Classes/BELAUGens.sc
cp $SCSOURCE/examples/bela/*.* Examples/
cp $SCSOURCE/HelpSource/Classes/DigitalIn.schelp HelpSource/Classes/DigitalIn.schelp
cp $SCSOURCE/HelpSource/Classes/DigitalIO.schelp HelpSource/Classes/DigitalIO.schelp
cp $SCSOURCE/HelpSource/Classes/DigitalOut.schelp HelpSource/Classes/DigitalOut.schelp
cp $SCSOURCE/HelpSource/Classes/AnalogIn.schelp HelpSource/Classes/AnalogIn.schelp
cp $SCSOURCE/HelpSource/Classes/AnalogOut.schelp HelpSource/Classes/AnalogOut.schelp

cd $SCSOURCE; git log -n 1 | grep commit > $THISDIR/fromSCgitcommit.txt
cd $SCSOURCE; git log -n 1 | grep Date >> $THISDIR/fromSCgitcommit.txt
cd $THISDIR
echo "copied files from SuperCollider's git commit:"
cat fromSCgitcommit.txt
