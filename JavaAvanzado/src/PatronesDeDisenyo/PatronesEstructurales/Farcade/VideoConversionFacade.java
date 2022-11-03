package PatronesDeDisenyo.PatronesEstructurales.Farcade;

import java.io.File;

public class VideoConversionFacade {
    public File convertVideo(String filename, String format) {
        System.out.println("VideoConversionFacade: Conversion started");
        VideoFile file = new VideoFile(filename);

        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;


        if (format.equals("mp4")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            destinationCodec = new MPEG4CompressionCodec();
        }

        VideoFile buffer = BitrateReader.read(file, sourceCodec);
        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);

        File result = (new AudioMixer()).fix(intermediateResult);
        System.out.println("ya he terminado");
        return result;



    }
    }
