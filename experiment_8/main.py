from fastapi import FastAPI
from fastapi.staticfiles import StaticFiles
from fastapi.responses import Response
import httpx


app = FastAPI()
@app.get("/cat")
async def cat():
    url = "https://cataas.com/cat/cool/says/cool"
    async with httpx.AsyncClient() as client:
        response = await client.get(url)
    
    return Response(
        content=response.content,
        media_type="image/png"
    )


app.mount("/",StaticFiles(directory="src/static",html=True),name='static')

