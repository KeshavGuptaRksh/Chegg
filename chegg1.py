from cgitb import html
from matplotlib.pyplot import title
import pandas as pd
from bs4 import BeautifulSoup
from urllib.request import urlopen
import requests

url = 'https://www.worldometers.info/coronavirus/'
html = urlopen(url)
soup = BeautifulSoup(html,'lxml')
type(soup)
title = soup.title
print(title)