import datetime
import speech_recognition as sr
import webbrowser
import pyttsx3
import wikipedia
import os
import smtplib

engine = pyttsx3.init('sapi5')
voices = engine.getProperty('voices')
print(voices[1].id)
engine.setProperty('voice', voices[1].id)


def speak(audio):
    engine.say(audio)
    engine.runAndWait()


def wishme():
    hour = int(datetime.datetime.now().hour)
    if hour >= 0 and hour < 12:
        speak("Good Morning")
    elif hour >= 12 and hour < 18:
        speak("Good afternoon")
    else:
        speak("Good evening")
    speak("I am Friday Sir, How may I help You ?")


def takeCommand():
    # It takes microphone input from the user and returns string output
    r = sr.Recognizer()
    with sr.Microphone as source:
        print("Friday Listening")
        r.pause_threshold = 1
        audio = r.listen(source)

    try:
        print("Recognizing...")
        myquery = r.recognize_google(audio, language='en-in')
        print(f"user said:{myquery}\n")

    except Exception as e:
        # print(e)
        print("Say that again")
        return "None"
    return myquery


def sendEmail(to, content):
    server = smtplib.SMTP("smtp.gmail.com", 587)
    server.ehlo()
    server.starttls()
    server.login("247dhiraj247@gmail.com", "247dhiraj247")
    server.sendmail("247dhiraj247@gmail.com", to, content)
    server.close()


if __name__ == "__main__":
    wishme()
    while True:
        query = takeCommand().lower

    # logic on executing task based on query
    if 'wikipedia' in query:
        speak("searching wikipedia...")
        query = query.replace('wikipedia', '')
        results = wikipedia.summary(query, sentence=2)
        speak("according to wikipedia")
        print(results)
        speak(results)

    elif 'open youtube' in query:
        speak("Opening Youtube")
        webbrowser.open("youtube.com")

    elif 'open google' in query:
        speak("Opening Google")
        webbrowser.open("google.com")

    elif 'open stack overflow' in query:
        speak("Opening stack overflow")
        webbrowser.open("stackoverflow.com")

    elif 'play music' in query:
        music_dir = 'D:\\'
        songs = os.listdir(music_dir)
        print(songs)
        os.startfile(os.path.join(music_dir, songs[0]))
    elif 'the time' in query:
        strTime = datetime.datetime.now.strftime("%H:%M")
        speak("Sir the time is")
    elif 'code' in query:
        codePath = "C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Visual Studio Code\\Code.exe"
        os.startfile(codePath)
    elif 'email to dhiraj' in query:
        try:
            speak("What should I say")
            content = takeCommand()
            to = "247dhiraj247@gmail.com"
            sendEmail(to, content)
            speak("Email has been sent")
        except Exception as e:
            print(e)
            speak("Sorry My friend, I am unable to send this mail")
