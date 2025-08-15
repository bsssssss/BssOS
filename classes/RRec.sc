RRec {
	var <>baseDir = "~/Sounds/samples/sc/gen";

	filepath { |synthDef, index| 
		^baseDir 
			+/+ synthDef.asString 
			+/+ synthDef.asString 
			++ "_" ++ index.asString.padLeft(3, "0")
			++ ".wav"
	}
}
