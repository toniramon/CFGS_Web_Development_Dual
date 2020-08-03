def to_camel_case(text):
    signos = { "_", "-" }
    for letra in text:
        if letra in signos:
          text=text.replace(letra, " ")
    
    PrimeraPalabra=text.find(" ")
    palabra=text[ :PrimeraPalabra]
    text = text[PrimeraPalabra:].title()
    text = text.split(" ")
    text= "".join(text)
    return palabra + text

#casos test
if __name__ == "__main__":
    
    assert to_camel_case("the_warrior-win") == "theWarriorWin", "caso test 1"
    assert to_camel_case("the-stealth-warrior") == "theStealthWarrior", "caso test 2"
    assert to_camel_case("The_Stealth_Warrior") == "TheStealthWarrior", "caso test 3"