def banner_text(text):
    screen_width = 20
    if len(text) > screen_width - 4:
        print("EEK")
        print("the text is too long to fit in the specified width")

    if text == "*":
        print("*" * screen_width)
    else:
        output_string = "**{0}**".format(text.center(screen_width - 4))
        print(output_string)


banner_text("help")
