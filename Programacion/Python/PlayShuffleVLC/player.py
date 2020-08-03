from funcionesVLC import checkSeleccionaCancionRandom,checkPlaySuffle,seleccionaCancionRandom,iniciarPlayList,imprimirCancionesReproducidas,lanzarVLC,playShuffle

## PROGRAMA PRINCIPAL ##


def playShuffleVLC(libreria, playList):

    playShuffle(libreria, playList)

    imprimirCancionesReproducidas(playList)

    lanzarVLC(libreria, playList)


playList = {}
# playList ={ 1: "titulo cancion", 2: "titulo cancion" ... }


libreria = {"Crossfade - Colors":
                {"track-number": 1, "artist": "Crossfade", "album": "Crossfade", "location": "./biblioteca/colors.mp3"},
            "Rise Against - Make It Stop (Septembers Children)": 
                {"track-number": 2, "artist": "Rise Against", "album": "Endgame", "location": "./biblioteca/makeitstop.mp3"},
            "AFI - Miss Murder": 
                {"track-number": 3, "artist": "AFI", "album": "Decemberunderground", "location": "./biblioteca/missmurder.mp3"}
            }

playShuffleVLC(libreria, playList)